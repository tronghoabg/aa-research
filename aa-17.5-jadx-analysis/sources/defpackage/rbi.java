package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.car.RadioMetadata;

/* loaded from: classes2.dex */
public final class rbi {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public Bitmap f;

    public final RadioMetadata.RadioSongMetadata a() {
        return new RadioMetadata.RadioSongMetadata(this.a, this.b, this.c, this.d, null, this.e, this.f);
    }
}
