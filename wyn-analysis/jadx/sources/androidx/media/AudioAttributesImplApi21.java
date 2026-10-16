package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f18708a;

    /* renamed from: b, reason: collision with root package name */
    public int f18709b = -1;

    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        int i5 = this.f18709b;
        return i5 != -1 ? i5 : AudioAttributesCompat.c(this.f18708a.getFlags(), this.f18708a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final Object b() {
        return this.f18708a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f18708a.equals(((AudioAttributesImplApi21) obj).f18708a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18708a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f18708a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f18708a = audioAttributes;
    }
}
