package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahuj {
    public static final ahuj INSTANCE = new ahuj();

    private ahuj() {
    }

    private final ahuc createArrayValue(List<?> list, agcu agcuVar, afyi afyiVar) {
        List listCf = woy.cf(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listCf.iterator();
        while (it.hasNext()) {
            ahuh ahuhVarCreateConstantValue$default = createConstantValue$default(this, it.next(), null, 2, null);
            if (ahuhVarCreateConstantValue$default != null) {
                arrayList.add(ahuhVarCreateConstantValue$default);
            }
        }
        if (agcuVar == null) {
            return new ahuc(arrayList, new ahui(afyiVar));
        }
        aigw primitiveArrayKotlinType = agcuVar.getBuiltIns().getPrimitiveArrayKotlinType(afyiVar);
        primitiveArrayKotlinType.getClass();
        return new ahvj(arrayList, primitiveArrayKotlinType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl createArrayValue$lambda$0(afyi afyiVar, agcu agcuVar) {
        agcuVar.getClass();
        aigw primitiveArrayKotlinType = agcuVar.getBuiltIns().getPrimitiveArrayKotlinType(afyiVar);
        primitiveArrayKotlinType.getClass();
        return primitiveArrayKotlinType;
    }

    public static /* synthetic */ ahuh createConstantValue$default(ahuj ahujVar, Object obj, agcu agcuVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            agcuVar = null;
        }
        return ahujVar.createConstantValue(obj, agcuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [afbe] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [afbe] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v5, types: [afbe] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [afbe] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ahuj] */
    public final ahuh<?> createConstantValue(Object obj, agcu agcuVar) {
        ?? Bg;
        ?? Bg2;
        ?? Bg3;
        ?? Bg4;
        if (obj instanceof Byte) {
            return new ahue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ahvg(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new ahuq(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new ahvd(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new ahuf(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new ahup(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new ahuk(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new ahud(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new ahvh((String) obj);
        }
        int i = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            bArr.getClass();
            int length = bArr.length;
            if (length == 0) {
                Bg4 = afbe.a;
            } else if (length != 1) {
                Bg4 = new ArrayList(length);
                while (i < length) {
                    Bg4.add(Byte.valueOf(bArr[i]));
                    i++;
                }
            } else {
                Bg4 = woy.bg(Byte.valueOf(bArr[0]));
            }
            return createArrayValue(Bg4, agcuVar, afyi.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            sArr.getClass();
            int length2 = sArr.length;
            if (length2 == 0) {
                Bg3 = afbe.a;
            } else if (length2 != 1) {
                Bg3 = new ArrayList(length2);
                while (i < length2) {
                    Bg3.add(Short.valueOf(sArr[i]));
                    i++;
                }
            } else {
                Bg3 = woy.bg(Short.valueOf(sArr[0]));
            }
            return createArrayValue(Bg3, agcuVar, afyi.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(woy.dd((int[]) obj), agcuVar, afyi.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(woy.de((long[]) obj), agcuVar, afyi.LONG);
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            cArr.getClass();
            int length3 = cArr.length;
            if (length3 == 0) {
                Bg2 = afbe.a;
            } else if (length3 != 1) {
                Bg2 = new ArrayList(length3);
                while (i < length3) {
                    Bg2.add(Character.valueOf(cArr[i]));
                    i++;
                }
            } else {
                Bg2 = woy.bg(Character.valueOf(cArr[0]));
            }
            return createArrayValue(Bg2, agcuVar, afyi.CHAR);
        }
        if (obj instanceof float[]) {
            return createArrayValue(woy.dc((float[]) obj), agcuVar, afyi.FLOAT);
        }
        if (!(obj instanceof double[])) {
            if (obj instanceof boolean[]) {
                return createArrayValue(woy.dg((boolean[]) obj), agcuVar, afyi.BOOLEAN);
            }
            if (obj != null) {
                return null;
            }
            return new ahve();
        }
        double[] dArr = (double[]) obj;
        dArr.getClass();
        int length4 = dArr.length;
        if (length4 == 0) {
            Bg = afbe.a;
        } else if (length4 != 1) {
            Bg = new ArrayList(length4);
            while (i < length4) {
                Bg.add(Double.valueOf(dArr[i]));
                i++;
            }
        } else {
            Bg = woy.bg(Double.valueOf(dArr[0]));
        }
        return createArrayValue(Bg, agcuVar, afyi.DOUBLE);
    }

    public final ahuc createArrayValue(List<? extends ahuh<?>> list, aigl aiglVar) {
        list.getClass();
        aiglVar.getClass();
        return new ahvj(list, aiglVar);
    }
}
