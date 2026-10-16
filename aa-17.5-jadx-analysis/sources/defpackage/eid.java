package defpackage;

import defpackage.eid;
import defpackage.eie;
import java.util.List;

/* loaded from: classes.dex */
public abstract class eid<MessageType extends eie<MessageType, BuilderType>, BuilderType extends eid<MessageType, BuilderType>> implements ekd {
    public static void b(List list, int i) {
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

    @Override // 
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract eid clone();
}
