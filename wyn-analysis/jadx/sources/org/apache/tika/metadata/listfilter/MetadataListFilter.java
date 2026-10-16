package org.apache.tika.metadata.listfilter;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.w3c.dom.Element;

/* loaded from: classes5.dex */
public abstract class MetadataListFilter extends ConfigBase implements Serializable {
    public static MetadataListFilter load(Element element, boolean z2) throws IOException, TikaConfigException {
        try {
            return (MetadataListFilter) ConfigBase.buildComposite("metadataListFilters", CompositeMetadataListFilter.class, "metadataListFilter", MetadataListFilter.class, element);
        } catch (TikaConfigException e7) {
            if (z2 && e7.getMessage().contains("could not find metadataListFilters")) {
                return new NoOpListFilter();
            }
            throw e7;
        }
    }

    public abstract List<Metadata> filter(List<Metadata> list) throws TikaException;
}
