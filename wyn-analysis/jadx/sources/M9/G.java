package m9;

/* loaded from: classes4.dex */
public final class G extends s8.j {

    /* renamed from: a, reason: collision with root package name */
    public final F f40425a;

    public G(String str, F f10) {
        super(str);
        Fe.c.l(str, "Provided message must not be null.");
        A6.c.z(f10 != F.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        this.f40425a = f10;
    }

    public G(String str, F f10, Exception exc) {
        super(str, exc);
        Fe.c.l(str, "Provided message must not be null.");
        A6.c.z(f10 != F.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        Fe.c.l(f10, "Provided code must not be null.");
        this.f40425a = f10;
    }
}
