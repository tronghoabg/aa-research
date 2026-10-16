package androidx.media3.datasource.cache;

import android.net.Uri;
import com.google.d.b.an;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ContentMetadataMutations {
    private final Map<String, Object> editedValues = new HashMap();
    private final List<String> removedValues = new ArrayList();

    private ContentMetadataMutations checkAndSet(String str, Object obj) {
        an.B(str);
        an.B(obj);
        this.editedValues.put(str, obj);
        this.removedValues.remove(str);
        return this;
    }

    public static ContentMetadataMutations setContentLength(ContentMetadataMutations contentMetadataMutations, long j2) {
        return contentMetadataMutations.set(ContentMetadata.KEY_CONTENT_LENGTH, j2);
    }

    public static ContentMetadataMutations setRedirectedUri(ContentMetadataMutations contentMetadataMutations, Uri uri) {
        return uri == null ? contentMetadataMutations.remove(ContentMetadata.KEY_REDIRECTED_URI) : contentMetadataMutations.set(ContentMetadata.KEY_REDIRECTED_URI, uri.toString());
    }

    public Map<String, Object> getEditedValues() {
        HashMap map = new HashMap(this.editedValues);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return DesugarCollections.unmodifiableMap(map);
    }

    public List<String> getRemovedValues() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.removedValues));
    }

    public ContentMetadataMutations remove(String str) {
        this.removedValues.add(str);
        this.editedValues.remove(str);
        return this;
    }

    public ContentMetadataMutations set(String str, byte[] bArr) {
        checkAndSet(str, Arrays.copyOf(bArr, bArr.length));
        return this;
    }

    public ContentMetadataMutations set(String str, String str2) {
        checkAndSet(str, str2);
        return this;
    }

    public ContentMetadataMutations set(String str, long j2) {
        checkAndSet(str, Long.valueOf(j2));
        return this;
    }
}
