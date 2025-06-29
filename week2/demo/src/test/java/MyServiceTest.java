import com.example.service.MyService;
import com.example.external.ExternalApi;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testFetchDataReturnsApiData() {
        // Arrange: create a mock ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("mocked data");

        MyService service = new MyService(mockApi);

        // Act
        String result = service.fetchData();

        // Assert
        assertEquals("mocked data", result);
    }
}