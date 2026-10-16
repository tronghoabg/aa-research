package defpackage;

import defpackage.abmc;
import defpackage.abmd;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class abmc<MessageType extends abmd<MessageType, BuilderType>, BuilderType extends abmc<MessageType, BuilderType>> implements abov {
    private static void b(List list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size < i) {
                throw new NullPointerException(str);
            }
            list.remove(size);
        }
    }

    public static void i(Iterable iterable, List list) {
        iterable.getClass();
        if (!(iterable instanceof aboq)) {
            if (iterable instanceof abpd) {
                list.addAll((Collection) iterable);
                return;
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size);
                } else if (list instanceof abpf) {
                    ((abpf) list).e(list.size() + size);
                }
            }
            int size2 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (Object obj : iterable) {
                    if (obj == null) {
                        b(list, size2);
                    }
                    list.add(obj);
                }
                return;
            }
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                Object obj2 = list2.get(i);
                if (obj2 == null) {
                    b(list, size2);
                }
                list.add(obj2);
            }
            return;
        }
        List listA = ((aboq) iterable).a();
        aboq aboqVar = (aboq) list;
        int size4 = list.size();
        for (Object obj3 : listA) {
            if (obj3 == null) {
                String str = "Element at index " + (aboqVar.size() - size4) + " is null.";
                int size5 = aboqVar.size();
                while (true) {
                    size5--;
                    if (size5 < size4) {
                        throw new NullPointerException(str);
                    }
                    aboqVar.remove(size5);
                }
            } else if (obj3 instanceof abms) {
                aboqVar.b();
            } else if (obj3 instanceof byte[]) {
                byte[] bArr = (byte[]) obj3;
                int length = bArr.length;
                abms abmsVar = abms.d;
                try {
                    abms.E(bArr, 0, length);
                    aboqVar.b();
                } catch (abon e) {
                    throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                }
            } else {
                aboqVar.add((String) obj3);
            }
        }
    }

    @Override // 
    /* renamed from: a */
    public abstract abmc clone();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abov
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract abmc g(abmd abmdVar);

    @Override // defpackage.abov
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final abmc h(byte[] bArr, abnj abnjVar) throws abon {
        return k(bArr, bArr.length, abnjVar);
    }

    @Override // defpackage.abov
    public /* bridge */ /* synthetic */ void j(abmw abmwVar, abnj abnjVar) throws IOException {
        throw null;
    }

    public abmc k(byte[] bArr, int i, abnj abnjVar) throws abon {
        throw null;
    }

    @Override // defpackage.abov
    public /* bridge */ /* synthetic */ void l(byte[] bArr, int i, int i2) throws abon {
        throw null;
    }
}
