package h.p;

import androidx.compose.foundation.style.StylePropertiesKt;
import h.g.b.x;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements Comparable, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final h.d.b f48286a = new h.d.b();

    /* renamed from: b, reason: collision with root package name */
    private static final a f48287b = new a(0, 0);

    /* renamed from: c, reason: collision with root package name */
    private final long f48288c;

    /* renamed from: d, reason: collision with root package name */
    private final long f48289d;

    private a(long j2, long j3) {
        this.f48288c = j2;
        this.f48289d = j3;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        x.f(this, "uuid");
        return new b(this.f48288c, this.f48289d);
    }

    public final String a() {
        long j2 = this.f48288c;
        byte[] bArr = new byte[36];
        h.e.b.i(j2, bArr, 0, 0, 4);
        bArr[8] = StylePropertiesKt.FontSynthesisId;
        h.e.b.i(j2, bArr, 9, 4, 6);
        bArr[13] = StylePropertiesKt.FontSynthesisId;
        h.e.b.i(j2, bArr, 14, 6, 8);
        bArr[18] = StylePropertiesKt.FontSynthesisId;
        long j3 = this.f48289d;
        h.e.b.i(j3, bArr, 19, 0, 2);
        bArr[23] = StylePropertiesKt.FontSynthesisId;
        h.e.b.i(j3, bArr, 24, 2, 8);
        x.f(bArr, "<this>");
        return new String(bArr, h.n.a.f48221b);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        a aVar = (a) obj;
        x.f(aVar, "other");
        long j2 = aVar.f48288c;
        long j3 = this.f48288c;
        return j3 != j2 ? h.d.b.f(j3, j2) : h.d.b.f(this.f48289d, aVar.f48289d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f48288c == aVar.f48288c && this.f48289d == aVar.f48289d;
    }

    public final int hashCode() {
        return a.a.b(this.f48288c ^ this.f48289d);
    }

    public final String toString() {
        return a();
    }

    public /* synthetic */ a(long j2, long j3, byte[] bArr) {
        this(j2, j3);
    }
}
