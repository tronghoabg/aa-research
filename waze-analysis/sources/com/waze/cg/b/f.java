package com.waze.cg.b;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.cg.a.k;
import com.waze.cg.c.l;
import com.waze.cg.c.m;
import com.waze.cg.c.o;
import com.waze.cg.c.p;
import h.a.i;
import h.g.b.x;
import java.util.List;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private static final k f22303a = new k("arg_01", "ARG", "Argentina", "🇦🇷");

    /* renamed from: b, reason: collision with root package name */
    private static final List f22304b = i.i(new k("fra_02", "FRA", "France", "🇫🇷"), new k("bra_03", "BRA", "Brazil", "🇧🇷"), new k("ger_04", "GER", "Germany", "🇩🇪"));

    public static final p a() {
        k kVar = (k) i.V(f22304b, h.j.f.f48136a);
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        k kVar2 = f22303a;
        return new p(string, new o(kVar2.b(), kVar2.a()), new o(kVar.b(), kVar.a()), ExifInterface.GPS_MEASUREMENT_3D, "0", new l(com.waze.cg.a.f.f22263b), "87'");
    }

    public static final p b() {
        k kVar = (k) i.V(f22304b, h.j.f.f48136a);
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        k kVar2 = f22303a;
        return new p(string, new o(kVar2.b(), kVar2.a()), new o(kVar.b(), kVar.a()), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, "0", new m("L. Messi"), "35'");
    }

    public static final p c() {
        k kVar = (k) i.V(f22304b, h.j.f.f48136a);
        String string = UUID.randomUUID().toString();
        x.e(string, "toString(...)");
        k kVar2 = f22303a;
        return new p(string, new o(kVar2.b(), kVar2.a()), new o(kVar.b(), kVar.a()), "0", "0", new l(com.waze.cg.a.f.f22262a), "0'");
    }
}
