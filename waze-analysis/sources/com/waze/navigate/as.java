package com.waze.navigate;

import com.waze.R;
import com.waze.jni.protos.navigate.DriveTo;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31003a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.shared_infra.i.e f31004b;

    static {
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("DangerZoneUtils");
        h.g.b.x.e(eVarD, "create(...)");
        f31004b = eVarD;
    }

    public static final String a(DriveTo.DangerZoneType dangerZoneType, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        if (dangerZoneType == null) {
            f31004b.g("null danger zone, defaulting to OTHER");
            dangerZoneType = DriveTo.DangerZoneType.OTHER;
        }
        int iOrdinal = dangerZoneType.ordinal();
        if (iOrdinal == 0) {
            return aVar.c(R.string.DANGEROUS_ADDRESS_PREVIEW_TITLE, new Object[0]);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? aVar.c(R.string.DANGEROUS_ADDRESS_PREVIEW_TITLE2, new Object[0]) : aVar.c(R.string.DANGEROUS_ADDRESS_PREVIEW_TITLE2, new Object[0]) : aVar.c(R.string.DANGEROUS_ADDRESS_PREVIEW_TITLE1, new Object[0]);
        }
        com.waze.shared_infra.i.e eVar = f31004b;
        Objects.toString(dangerZoneType);
        eVar.g("Incorrect danger zone type: ".concat(String.valueOf(dangerZoneType)));
        return null;
    }

    public static /* synthetic */ String b(DriveTo.DangerZoneType dangerZoneType) {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        h.g.b.x.f(aVarA, "stringProvider");
        if (dangerZoneType == null) {
            f31004b.g("null danger zone, defaulting to OTHER");
            dangerZoneType = DriveTo.DangerZoneType.OTHER;
        }
        int iOrdinal = dangerZoneType.ordinal();
        if (iOrdinal == 0) {
            return aVarA.c(R.string.DANGEROUS_ADDRESS_GO, new Object[0]);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? aVarA.c(R.string.DANGEROUS_ADDRESS_GO2, new Object[0]) : aVarA.c(R.string.DANGEROUS_ADDRESS_GO2, new Object[0]) : aVarA.c(R.string.DANGEROUS_ADDRESS_GO1, new Object[0]);
        }
        com.waze.shared_infra.i.e eVar = f31004b;
        Objects.toString(dangerZoneType);
        eVar.g("Incorrect danger zone type: ".concat(String.valueOf(dangerZoneType)));
        return null;
    }

    public static /* synthetic */ String c(DriveTo.DangerZoneType dangerZoneType) {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        h.g.b.x.f(aVarA, "stringProvider");
        if (dangerZoneType == null) {
            f31004b.g("null danger zone, defaulting to OTHER");
            dangerZoneType = DriveTo.DangerZoneType.OTHER;
        }
        int iOrdinal = dangerZoneType.ordinal();
        if (iOrdinal == 0) {
            return aVarA.c(R.string.DANGEROUS_ADDRESS_SAVE, new Object[0]);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? aVarA.c(R.string.DANGEROUS_ADDRESS_SAVE2, new Object[0]) : aVarA.c(R.string.DANGEROUS_ADDRESS_SAVE2, new Object[0]) : aVarA.c(R.string.DANGEROUS_ADDRESS_SAVE1, new Object[0]);
        }
        com.waze.shared_infra.i.e eVar = f31004b;
        Objects.toString(dangerZoneType);
        eVar.g("Incorrect danger zone type: ".concat(String.valueOf(dangerZoneType)));
        return null;
    }

    public static /* synthetic */ String d(DriveTo.DangerZoneType dangerZoneType) {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        h.g.b.x.f(aVarA, "stringProvider");
        if (dangerZoneType == null) {
            f31004b.g("null danger zone, defaulting to OTHER");
            dangerZoneType = DriveTo.DangerZoneType.OTHER;
        }
        int iOrdinal = dangerZoneType.ordinal();
        if (iOrdinal == 0) {
            return aVarA.c(R.string.DANGEROUS_AREA_DIALOG_TITLE, new Object[0]);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? aVarA.c(R.string.DANGEROUS_AREA_DIALOG_TITLE2, new Object[0]) : aVarA.c(R.string.DANGEROUS_AREA_DIALOG_TITLE2, new Object[0]) : aVarA.c(R.string.DANGEROUS_AREA_DIALOG_TITLE1, new Object[0]);
        }
        com.waze.shared_infra.i.e eVar = f31004b;
        Objects.toString(dangerZoneType);
        eVar.g("Incorrect danger zone type: ".concat(String.valueOf(dangerZoneType)));
        return null;
    }

    public static final String e(DriveTo.DangerZoneType dangerZoneType, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        if (dangerZoneType == null) {
            f31004b.g("null danger zone, defaulting to OTHER");
            dangerZoneType = DriveTo.DangerZoneType.OTHER;
        }
        int iOrdinal = dangerZoneType.ordinal();
        if (iOrdinal == 0) {
            return aVar.c(R.string.DANGEROUS_ADDRESS_VIA, new Object[0]);
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? iOrdinal != 4 ? aVar.c(R.string.DANGEROUS_ADDRESS_VIA2, new Object[0]) : aVar.c(R.string.DANGEROUS_ADDRESS_VIA2, new Object[0]) : aVar.c(R.string.DANGEROUS_ADDRESS_VIA1, new Object[0]);
        }
        com.waze.shared_infra.i.e eVar = f31004b;
        Objects.toString(dangerZoneType);
        eVar.g("Incorrect danger zone type: ".concat(String.valueOf(dangerZoneType)));
        return null;
    }

    public static final com.waze.shared_infra.i.e f() {
        return f31004b;
    }
}
