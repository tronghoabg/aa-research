package org.apache.tika.metadata.filter;

import N0.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes5.dex */
public class ClearByAttachmentTypeMetadataFilter extends MetadataFilter {
    private final Set<String> types;

    public ClearByAttachmentTypeMetadataFilter() {
        this(new HashSet());
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) throws TikaException {
        String str = metadata.get(TikaCoreProperties.EMBEDDED_RESOURCE_TYPE);
        if (str != null && this.types.contains(str)) {
            for (String str2 : metadata.names()) {
                metadata.remove(str2);
            }
        }
    }

    public List<String> getTypes() {
        return new ArrayList(this.types);
    }

    @Field
    public void setTypes(List<String> list) throws TikaConfigException {
        for (String str : list) {
            try {
                TikaCoreProperties.EmbeddedResourceType.valueOf(str);
            } catch (IllegalArgumentException unused) {
                StringBuilder sb2 = new StringBuilder();
                TikaCoreProperties.EmbeddedResourceType[] embeddedResourceTypeArrValues = TikaCoreProperties.EmbeddedResourceType.values();
                int length = embeddedResourceTypeArrValues.length;
                int i5 = 0;
                int i10 = 0;
                while (i5 < length) {
                    TikaCoreProperties.EmbeddedResourceType embeddedResourceType = embeddedResourceTypeArrValues[i5];
                    int i11 = i10 + 1;
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(embeddedResourceType.name());
                    i5++;
                    i10 = i11;
                }
                throw new TikaConfigException(a.h("I'm sorry. I regret I don't recognise ", str, ". I do recognize the following (case-sensitive):", sb2.toString()));
            }
        }
        this.types.addAll(list);
    }

    public ClearByAttachmentTypeMetadataFilter(Set<String> set) {
        this.types = set;
    }
}
