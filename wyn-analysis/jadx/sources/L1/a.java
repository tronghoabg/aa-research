package L1;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;
import y3.C4552j;

/* loaded from: classes.dex */
public final class a extends C4552j {
    @Override // y3.C4552j
    public final AudioAttributesImpl h() {
        return new AudioAttributesImplApi26(((AudioAttributes.Builder) this.f48001b).build());
    }

    @Override // y3.C4552j
    public final C4552j s(int i5) {
        ((AudioAttributes.Builder) this.f48001b).setUsage(i5);
        return this;
    }

    @Override // y3.C4552j
    public final C4552j t(int i5) {
        ((AudioAttributes.Builder) this.f48001b).setUsage(i5);
        return this;
    }
}
