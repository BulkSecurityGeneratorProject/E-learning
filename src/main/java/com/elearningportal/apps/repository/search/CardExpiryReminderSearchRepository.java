package com.elearningportal.apps.repository.search;

import com.elearningportal.apps.domain.CardExpiryReminder;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the CardExpiryReminder entity.
 */
public interface CardExpiryReminderSearchRepository extends ElasticsearchRepository<CardExpiryReminder, Long> {
}
