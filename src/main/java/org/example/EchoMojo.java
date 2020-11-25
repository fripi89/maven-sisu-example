/**
 *
 */
package org.example;

import javax.inject.Inject;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.codehaus.plexus.logging.Logger;

/**
 *
 */
@Mojo(
	name = "echo",
	requiresProject = false
)
public class EchoMojo extends AbstractMojo {

	@Inject
	private Logger logger;

	@Parameter(property = "echo.message", required = true)
	private String message;

	@Inject
	@Config
	private String config;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		logger.info(message + " / " + config);
	}
}
