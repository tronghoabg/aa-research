package L1;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import j$.util.Objects;
import y3.C4552j;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f6818g;

    /* renamed from: a, reason: collision with root package name */
    public final int f6819a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f6820b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f6821c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f6822d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6823e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6824f;

    static {
        int i5 = AudioAttributesCompat.f18706b;
        C4552j aVar = Build.VERSION.SDK_INT >= 26 ? new a(15) : new C4552j(15);
        aVar.t(1);
        AudioAttributesImpl audioAttributesImplH = aVar.h();
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f18707a = audioAttributesImplH;
        f6818g = audioAttributesCompat;
    }

    public d(int i5, db.c cVar, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z2) {
        this.f6819a = i5;
        this.f6821c = handler;
        this.f6822d = audioAttributesCompat;
        this.f6823e = z2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 || handler.getLooper() == Looper.getMainLooper()) {
            this.f6820b = cVar;
        } else {
            this.f6820b = new c(cVar, handler);
        }
        if (i10 >= 26) {
            this.f6824f = b.a(i5, audioAttributesCompat != null ? (AudioAttributes) audioAttributesCompat.f18707a.b() : null, z2, this.f6820b, handler);
        } else {
            this.f6824f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f6819a == dVar.f6819a && this.f6823e == dVar.f6823e && Objects.equals(this.f6820b, dVar.f6820b) && Objects.equals(this.f6821c, dVar.f6821c) && Objects.equals(this.f6822d, dVar.f6822d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f6819a), this.f6820b, this.f6821c, this.f6822d, Boolean.valueOf(this.f6823e));
    }
}
