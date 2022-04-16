package guru.qa.allure.notifications.template.data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kadehar
 * @since 1.0
 * Utility class for mapping template data for template.
 */
public class MessageData {
    private static final Logger LOG =
            LoggerFactory.getLogger(MessageData.class);

    private final BuildData buildData = new BuildData();
    private final SummaryData summaryData = new SummaryData();
    private final PhrasesData phrasesData = new PhrasesData();

    public Map<String, Object> values() {
        Map<String, Object> data = new HashMap<>();
        LOG.info("Collecting template data");
        data.putAll(buildData.map());
        data.putAll(summaryData.map());
        data.putAll(phrasesData.map());
        LOG.info("Template data: {}", data);
        return data;
    }
}
