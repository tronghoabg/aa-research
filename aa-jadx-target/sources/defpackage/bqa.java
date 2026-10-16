package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bqa {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.byu(new defpackage.bli(10));
    }

    public static final defpackage.cld a(defpackage.bpz bpzVar, int i) {
        switch (i - 1) {
            case 1:
                return bpzVar.e;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return bpzVar.g;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.bcr bcrVar = bpzVar.e;
                defpackage.bcr bcrVar2 = defpackage.bpy.a;
                defpackage.bcs bcsVar = defpackage.bpy.i;
                return defpackage.bcr.b(bcrVar, null, null, bcsVar, bcsVar, 3);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return bpzVar.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.bcr bcrVar3 = bpzVar.a;
                defpackage.bcr bcrVar4 = defpackage.bpy.a;
                defpackage.bcs bcsVar2 = defpackage.bpy.i;
                return defpackage.bcr.b(bcrVar3, null, null, bcsVar2, bcsVar2, 3);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.bcw.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return bpzVar.d;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.bcr bcrVar5 = bpzVar.d;
                defpackage.bcr bcrVar6 = defpackage.bpy.a;
                defpackage.bcs bcsVar3 = defpackage.bpy.i;
                return defpackage.bcr.b(bcrVar5, bcsVar3, null, null, bcsVar3, 6);
            case 9:
                return bpzVar.f;
            case 10:
            default:
                defpackage.bcr bcrVar7 = bpzVar.d;
                defpackage.bcr bcrVar8 = defpackage.bpy.a;
                defpackage.bcs bcsVar4 = defpackage.bpy.i;
                return defpackage.bcr.b(bcrVar7, null, bcsVar4, bcsVar4, null, 9);
            case 11:
                defpackage.bcr bcrVar9 = bpzVar.d;
                defpackage.bcr bcrVar10 = defpackage.bpy.a;
                defpackage.bcs bcsVar5 = defpackage.bpy.i;
                return defpackage.bcr.b(bcrVar9, null, null, bcsVar5, bcsVar5, 3);
            case 12:
                return bpzVar.c;
        }
    }

    public static final defpackage.cld b(int i, defpackage.bve bveVar) {
        return a(((defpackage.bol) bveVar.f(defpackage.bom.a)).c, i);
    }
}
