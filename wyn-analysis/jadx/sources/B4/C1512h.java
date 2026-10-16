package b4;

import ad.r;
import android.webkit.MimeTypeMap;
import cg.y;
import java.io.File;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: b4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1512h implements InterfaceC1511g {

    /* renamed from: a, reason: collision with root package name */
    public final File f19305a;

    public C1512h(File file) {
        this.f19305a = file;
    }

    @Override // b4.InterfaceC1511g
    public final Object a(InterfaceC3103c interfaceC3103c) {
        String str = y.f19937b;
        File file = this.f19305a;
        Z3.j jVar = new Z3.j(r.i(file), cg.m.f19913a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        AbstractC3340k.d(name, "getName(...)");
        return new m(jVar, singleton.getMimeTypeFromExtension(Bf.k.N0('.', name, "")), 3);
    }
}
