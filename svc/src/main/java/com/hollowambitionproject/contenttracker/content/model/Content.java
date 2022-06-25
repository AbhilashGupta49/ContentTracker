package com.hollowambitionproject.contenttracker.content.model;

import java.time.Duration;
import java.util.List;

/**
 * @param title
 * @param sectionID
 * @param approxTime
 * @param parts
 * @param metadata
 */
public record Content(String title, String sectionID,
                      Duration approxTime,
                      List<Content> parts,
                      ContentMetadata metadata) {
}
