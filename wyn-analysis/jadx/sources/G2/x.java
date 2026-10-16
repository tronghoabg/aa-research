package g2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x implements o2.j {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f35691a;

    /* renamed from: b, reason: collision with root package name */
    public final c2.g f35692b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f35693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f35694d;

    public x(z zVar, InputStream inputStream) {
        this.f35694d = zVar;
        this.f35691a = new DataInputStream(inputStream);
        c2.g gVar = new c2.g();
        gVar.f19563c = new ArrayList();
        gVar.f19561a = 1;
        this.f35692b = gVar;
    }

    @Override // o2.j
    public final void g() {
        this.f35693c = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    @Override // o2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void load() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.x.load():void");
    }
}
