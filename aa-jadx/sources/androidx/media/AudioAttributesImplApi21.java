package androidx.media;

/* JADX INFO: loaded from: classes2.dex */
public class AudioAttributesImplApi21 implements androidx.media.AudioAttributesImpl {
    public android.media.AudioAttributes a;
    public int b = -1;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof androidx.media.AudioAttributesImplApi21) {
            return this.a.equals(((androidx.media.AudioAttributesImplApi21) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        android.media.AudioAttributes audioAttributes = this.a;
        java.util.Objects.toString(audioAttributes);
        return "AudioAttributesCompat: audioattributes=".concat(java.lang.String.valueOf(audioAttributes));
    }
}
