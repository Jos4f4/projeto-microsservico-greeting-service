package br.com.erudio.configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;


@OpenAPIDefinition(info =
@Info(title = "Cambio Service API",
		version = "v1",
		description = "Documentation of Cambio Service API"))
public class OpenApiConfiguration {
	return new OpenAPI()
			.components(new Components())
			.info(
					new io.swagger.v3.oas.models.info.Info()
					.title("Cambio Service API")
					.version("v1")
					.license(
							new License()
							.name("Apache 2.0")
							.url("http://springdoc.org")
							)
				 );
			
}
