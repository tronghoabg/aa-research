package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes2.dex */
public final class eib implements eha {
    public static final eib a = new eib();

    @Override // defpackage.eha
    public final /* synthetic */ Object a() {
        return new eia(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #2 {, blocks: (B:6:0x0015, B:8:0x0019, B:13:0x002d, B:14:0x002f, B:11:0x0021, B:15:0x0031), top: B:127:0x0015, outer: #6 }] */
    @Override // defpackage.eha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.io.InputStream r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eib.b(java.io.InputStream):java.lang.Object");
    }

    @Override // defpackage.eha
    public final /* synthetic */ Object c(Object obj, OutputStream outputStream) throws IOException {
        ehx ehxVar;
        Map mapB = ((eia) obj).b();
        ejf ejfVarI = ehv.DEFAULT_INSTANCE.i();
        for (Map.Entry entry : mapB.entrySet()) {
            ehz ehzVar = (ehz) entry.getKey();
            Object value = entry.getValue();
            String str = ehzVar.a;
            if (value instanceof Boolean) {
                ejf ejfVarB = ehx.b();
                Boolean bool = (Boolean) value;
                bool.booleanValue();
                ejfVarB.g();
                ehx ehxVar2 = (ehx) ejfVarB.b;
                ehxVar2.valueCase_ = 1;
                ehxVar2.value_ = bool;
                eji ejiVarD = ejfVarB.d();
                ejiVarD.getClass();
                ehxVar = (ehx) ejiVarD;
            } else if (value instanceof Float) {
                ejf ejfVarB2 = ehx.b();
                float fFloatValue = ((Number) value).floatValue();
                ejfVarB2.g();
                ehx ehxVar3 = (ehx) ejfVarB2.b;
                ehxVar3.valueCase_ = 2;
                ehxVar3.value_ = Float.valueOf(fFloatValue);
                eji ejiVarD2 = ejfVarB2.d();
                ejiVarD2.getClass();
                ehxVar = (ehx) ejiVarD2;
            } else if (value instanceof Double) {
                ejf ejfVarB3 = ehx.b();
                double dDoubleValue = ((Number) value).doubleValue();
                ejfVarB3.g();
                ehx ehxVar4 = (ehx) ejfVarB3.b;
                ehxVar4.valueCase_ = 7;
                ehxVar4.value_ = Double.valueOf(dDoubleValue);
                eji ejiVarD3 = ejfVarB3.d();
                ejiVarD3.getClass();
                ehxVar = (ehx) ejiVarD3;
            } else if (value instanceof Integer) {
                ejf ejfVarB4 = ehx.b();
                int iIntValue = ((Number) value).intValue();
                ejfVarB4.g();
                ehx ehxVar5 = (ehx) ejfVarB4.b;
                ehxVar5.valueCase_ = 3;
                ehxVar5.value_ = Integer.valueOf(iIntValue);
                eji ejiVarD4 = ejfVarB4.d();
                ejiVarD4.getClass();
                ehxVar = (ehx) ejiVarD4;
            } else if (value instanceof Long) {
                ejf ejfVarB5 = ehx.b();
                long jLongValue = ((Number) value).longValue();
                ejfVarB5.g();
                ehx ehxVar6 = (ehx) ejfVarB5.b;
                ehxVar6.valueCase_ = 4;
                ehxVar6.value_ = Long.valueOf(jLongValue);
                eji ejiVarD5 = ejfVarB5.d();
                ejiVarD5.getClass();
                ehxVar = (ehx) ejiVarD5;
            } else if (value instanceof String) {
                ejf ejfVarB6 = ehx.b();
                String str2 = (String) value;
                ejfVarB6.g();
                ehx ehxVar7 = (ehx) ejfVarB6.b;
                str2.getClass();
                ehxVar7.valueCase_ = 5;
                ehxVar7.value_ = str2;
                eji ejiVarD6 = ejfVarB6.d();
                ejiVarD6.getClass();
                ehxVar = (ehx) ejiVarD6;
            } else if (value instanceof Set) {
                ejf ejfVarB7 = ehx.b();
                ejf ejfVarI2 = ehw.DEFAULT_INSTANCE.i();
                value.getClass();
                Set set = (Set) value;
                ejfVarI2.g();
                ehw ehwVar = (ehw) ejfVarI2.b;
                ejm<String> ejmVar = ehwVar.strings_;
                if (!ejmVar.c()) {
                    int size = ejmVar.size();
                    ehwVar.strings_ = ejmVar.d(size + size);
                }
                List list = ehwVar.strings_;
                Charset charset = ejn.a;
                if (set instanceof ejt) {
                    List listA = ((ejt) set).a();
                    ejt ejtVar = (ejt) list;
                    int size2 = list.size();
                    for (Object obj2 : listA) {
                        if (obj2 == null) {
                            String str3 = "Element at index " + (ejtVar.size() - size2) + " is null.";
                            int size3 = ejtVar.size();
                            while (true) {
                                size3--;
                                if (size3 < size2) {
                                    throw new NullPointerException(str3);
                                }
                                ejtVar.remove(size3);
                            }
                        } else if (obj2 instanceof eip) {
                            ejtVar.b();
                        } else if (obj2 instanceof byte[]) {
                            eip.i((byte[]) obj2);
                            ejtVar.b();
                        } else {
                            ejtVar.add((String) obj2);
                        }
                    }
                } else if (set instanceof ekl) {
                    list.addAll(set);
                } else {
                    int size4 = set.size();
                    if (list instanceof ArrayList) {
                        ((ArrayList) list).ensureCapacity(list.size() + size4);
                    } else if (list instanceof ekn) {
                        ekn eknVar = (ekn) list;
                        int size5 = list.size() + size4;
                        int length = eknVar.b.length;
                        if (size5 > length) {
                            if (length == 0) {
                                eknVar.b = new Object[Math.max(size5, 10)];
                            } else {
                                while (length < size5) {
                                    length = Math.max(((length * 3) / 2) + 1, 10);
                                }
                                eknVar.b = Arrays.copyOf(eknVar.b, length);
                            }
                        }
                    }
                    int size6 = list.size();
                    if ((set instanceof List) && (set instanceof RandomAccess)) {
                        List list2 = (List) set;
                        int size7 = list2.size();
                        for (int i = 0; i < size7; i++) {
                            Object obj3 = list2.get(i);
                            if (obj3 == null) {
                                eid.b(list, size6);
                            }
                            list.add(obj3);
                        }
                    } else {
                        for (Object obj4 : set) {
                            if (obj4 == null) {
                                eid.b(list, size6);
                            }
                            list.add(obj4);
                        }
                    }
                }
                ejfVarB7.g();
                ehx ehxVar8 = (ehx) ejfVarB7.b;
                ehw ehwVar2 = (ehw) ejfVarI2.d();
                ehwVar2.getClass();
                ehxVar8.value_ = ehwVar2;
                ehxVar8.valueCase_ = 6;
                eji ejiVarD7 = ejfVarB7.d();
                ejiVarD7.getClass();
                ehxVar = (ehx) ejiVarD7;
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(String.valueOf(value.getClass().getName())));
                }
                ejf ejfVarB8 = ehx.b();
                eip eipVarI = eip.i((byte[]) value);
                ejfVarB8.g();
                ehx ehxVar9 = (ehx) ejfVarB8.b;
                ehxVar9.valueCase_ = 8;
                ehxVar9.value_ = eipVarI;
                eji ejiVarD8 = ejfVarB8.d();
                ejiVarD8.getClass();
                ehxVar = (ehx) ejiVarD8;
            }
            ejfVarI.g();
            ehv ehvVar = (ehv) ejfVarI.b;
            ejz<String, ehx> ejzVar = ehvVar.preferences_;
            if (!ejzVar.b) {
                ehvVar.preferences_ = ejzVar.a();
            }
            ehvVar.preferences_.put(str, ehxVar);
        }
        ehv ehvVar2 = (ehv) ejfVarI.d();
        int iC = ehvVar2.c(null);
        boolean z = eiw.e;
        if (iC > 4096) {
            iC = 4096;
        }
        eit eitVar = new eit(outputStream, iC);
        ehvVar2.r(eitVar);
        if (eitVar.c > 0) {
            eitVar.h();
        }
        return afak.a;
    }
}
