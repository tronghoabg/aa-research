package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agms {
    private final Map<String, agnp> arguments;
    private final String className;

    /* JADX WARN: Multi-variable type inference failed */
    public agms(String str, Map<String, ? extends agnp> map) {
        str.getClass();
        map.getClass();
        this.className = str;
        this.arguments = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toString$lambda$0(aezu aezuVar) {
        aezuVar.getClass();
        Object obj = aezuVar.b;
        return ((String) aezuVar.a) + " = " + ((agnp) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof agms) {
            agms agmsVar = (agms) obj;
            if (affa.f(this.className, agmsVar.className) && affa.f(this.arguments, agmsVar.arguments)) {
                return true;
            }
        }
        return false;
    }

    public final Map<String, agnp> getArguments() {
        return this.arguments;
    }

    public final String getClassName() {
        return this.className;
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + this.arguments.hashCode();
    }

    public String toString() throws IOException {
        Collection collection;
        Collection collectionBg;
        Map<String, agnp> map = this.arguments;
        map.getClass();
        if (map.size() == 0) {
            collectionBg = afbe.a;
        } else {
            Iterator<Map.Entry<String, agnp>> it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry<String, agnp> next = it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new aezu(next.getKey(), next.getValue()));
                    do {
                        Map.Entry<String, agnp> next2 = it.next();
                        arrayList.add(new aezu(next2.getKey(), next2.getValue()));
                    } while (it.hasNext());
                    collection = arrayList;
                    return "@" + this.className + '(' + woy.cu(collection, null, null, null, agmr.INSTANCE, 31) + ')';
                }
                collectionBg = woy.bg(new aezu(next.getKey(), next.getValue()));
            } else {
                collectionBg = afbe.a;
            }
        }
        collection = collectionBg;
        return "@" + this.className + '(' + woy.cu(collection, null, null, null, agmr.INSTANCE, 31) + ')';
    }
}
