package androidx.credentials.webauthn;

import androidx.media3.muxer.MuxerUtil;
import h.a.c;
import h.a.i;
import h.a.r;
import h.g.b.aq;
import h.g.b.x;
import h.k.n;
import h.n.a;
import h.n.o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Cbor {
    private final int TYPE_UNSIGNED_INT;
    private final int TYPE_NEGATIVE_INT = 1;
    private final int TYPE_BYTE_STRING = 2;
    private final int TYPE_TEXT_STRING = 3;
    private final int TYPE_ARRAY = 4;
    private final int TYPE_MAP = 5;
    private final int TYPE_TAG = 6;
    private final int TYPE_FLOAT = 7;

    /* compiled from: WazeSource */
    public final class Arg {
        private final long arg;
        private final int len;

        public Arg(long j2, int i2) {
            this.arg = j2;
            this.len = i2;
        }

        public static /* synthetic */ Arg copy$default(Arg arg, long j2, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j2 = arg.arg;
            }
            if ((i3 & 2) != 0) {
                i2 = arg.len;
            }
            return arg.copy(j2, i2);
        }

        public final long component1() {
            return this.arg;
        }

        public final int component2() {
            return this.len;
        }

        public final Arg copy(long j2, int i2) {
            return new Arg(j2, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arg)) {
                return false;
            }
            Arg arg = (Arg) obj;
            return this.arg == arg.arg && this.len == arg.len;
        }

        public final long getArg() {
            return this.arg;
        }

        public final int getLen() {
            return this.len;
        }

        public int hashCode() {
            return (Cbor$Arg$$ExternalSyntheticBackport0.m(this.arg) * 31) + this.len;
        }

        public String toString() {
            return "Arg(arg=" + this.arg + ", len=" + this.len + ")";
        }
    }

    /* compiled from: WazeSource */
    public final class Item {
        private final Object item;
        private final int len;

        public Item(Object obj, int i2) {
            x.f(obj, "item");
            this.item = obj;
            this.len = i2;
        }

        public static /* synthetic */ Item copy$default(Item item, Object obj, int i2, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = item.item;
            }
            if ((i3 & 2) != 0) {
                i2 = item.len;
            }
            return item.copy(obj, i2);
        }

        public final Object component1() {
            return this.item;
        }

        public final int component2() {
            return this.len;
        }

        public final Item copy(Object obj, int i2) {
            x.f(obj, "item");
            return new Item(obj, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return x.n(this.item, item.item) && this.len == item.len;
        }

        public final Object getItem() {
            return this.item;
        }

        public final int getLen() {
            return this.len;
        }

        public int hashCode() {
            return (this.item.hashCode() * 31) + this.len;
        }

        public String toString() {
            return "Item(item=" + this.item + ", len=" + this.len + ")";
        }
    }

    private final byte[] createArg(int i2, long j2) {
        int i3 = i2 << 5;
        int i4 = (int) j2;
        if (j2 < 24) {
            return new byte[]{(byte) ((i3 | i4) & 255)};
        }
        if (j2 <= 255) {
            return new byte[]{(byte) ((i3 | 24) & 255), (byte) (i4 & 255)};
        }
        if (j2 <= 65535) {
            return new byte[]{(byte) ((i3 | 25) & 255), (byte) ((i4 >> 8) & 255), (byte) (i4 & 255)};
        }
        if (j2 > MuxerUtil.UNSIGNED_INT_MAX_VALUE) {
            throw new IllegalArgumentException("bad Arg");
        }
        return new byte[]{(byte) ((i3 | 26) & 255), (byte) ((i4 >> 24) & 255), (byte) ((i4 >> 16) & 255), (byte) ((i4 >> 8) & 255), (byte) (i4 & 255)};
    }

    static final int encode$lambda$0(aq aqVar, byte[] bArr, byte[] bArr2) {
        Object obj = ((Map) aqVar.f48105a).get(bArr);
        x.c(obj);
        byte[] bArr3 = (byte[]) obj;
        Object obj2 = ((Map) aqVar.f48105a).get(bArr2);
        x.c(obj2);
        byte[] bArr4 = (byte[]) obj2;
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length > length2) {
            return 1;
        }
        if (length < length2) {
            return -1;
        }
        int length3 = bArr3.length;
        int length4 = bArr4.length;
        if (length3 > length4) {
            return 1;
        }
        return length3 >= length4 ? 0 : -1;
    }

    private final Arg getArg(byte[] bArr, int i2) {
        long j2 = bArr[i2] & 31;
        if (j2 < 24) {
            return new Arg(j2, 1);
        }
        if (j2 == 24) {
            return new Arg(bArr[i2 + 1] & 255, 2);
        }
        if (j2 == 25) {
            int i3 = i2 + 2;
            return new Arg((bArr[i3] & 255) | ((bArr[i2 + 1] & 255) << 8), 3);
        }
        if (j2 != 26) {
            throw new IllegalArgumentException("Bad arg");
        }
        return new Arg((bArr[i2 + 4] & 255) | ((bArr[i2 + 1] & 255) << 24) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 8), 5);
    }

    private final int getType(byte[] bArr, int i2) {
        return (bArr[i2] & 255) >> 5;
    }

    private final Item parseItem(byte[] bArr, int i2) {
        int type = getType(bArr, i2);
        Arg arg = getArg(bArr, i2);
        if (type == this.TYPE_UNSIGNED_INT) {
            return new Item(Long.valueOf(arg.getArg()), arg.getLen());
        }
        if (type == this.TYPE_NEGATIVE_INT) {
            return new Item(Long.valueOf((-1) - arg.getArg()), arg.getLen());
        }
        if (type == this.TYPE_BYTE_STRING) {
            return new Item(c.al(bArr, n.u(arg.getLen() + i2, i2 + arg.getLen() + ((int) arg.getArg()))), arg.getLen() + ((int) arg.getArg()));
        }
        if (type == this.TYPE_TEXT_STRING) {
            return new Item(new String(c.al(bArr, n.u(arg.getLen() + i2, i2 + arg.getLen() + ((int) arg.getArg()))), a.f48221b), arg.getLen() + ((int) arg.getArg()));
        }
        int i3 = 0;
        if (type == this.TYPE_ARRAY) {
            ArrayList arrayList = new ArrayList();
            int len = arg.getLen();
            int arg2 = (int) arg.getArg();
            while (i3 < arg2) {
                Item item = parseItem(bArr, i2 + len);
                arrayList.add(item.getItem());
                len += item.getLen();
                i3++;
            }
            return new Item(i.ao(arrayList), len);
        }
        if (type != this.TYPE_MAP) {
            throw new IllegalArgumentException("Bad type");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int len2 = arg.getLen();
        int arg3 = (int) arg.getArg();
        while (i3 < arg3) {
            Item item2 = parseItem(bArr, i2 + len2);
            int len3 = len2 + item2.getLen();
            Item item3 = parseItem(bArr, i2 + len3);
            len2 = len3 + item3.getLen();
            linkedHashMap.put(item2.getItem(), item3.getItem());
            i3++;
        }
        return new Item(r.r(linkedHashMap), len2);
    }

    public final Object decode(byte[] bArr) {
        x.f(bArr, "data");
        return parseItem(bArr, 0).getItem();
    }

    public final byte[] encode(Object obj) {
        x.f(obj, "data");
        if (obj instanceof Number) {
            if (obj instanceof Double) {
                throw new IllegalArgumentException("Don't support doubles yet");
            }
            long jLongValue = ((Number) obj).longValue();
            return jLongValue >= 0 ? createArg(this.TYPE_UNSIGNED_INT, jLongValue) : createArg(this.TYPE_NEGATIVE_INT, (-1) - jLongValue);
        }
        if (obj instanceof byte[]) {
            return c.m(createArg(this.TYPE_BYTE_STRING, r6.length), (byte[]) obj);
        }
        if (obj instanceof String) {
            return c.m(createArg(this.TYPE_TEXT_STRING, r6.length()), o.q((String) obj));
        }
        if (obj instanceof List) {
            byte[] bArrCreateArg = createArg(this.TYPE_ARRAY, r6.size());
            for (Object obj2 : (List) obj) {
                x.c(obj2);
                bArrCreateArg = c.m(bArrCreateArg, encode(obj2));
            }
            return bArrCreateArg;
        }
        if (!(obj instanceof Map)) {
            throw new IllegalArgumentException("Bad type");
        }
        byte[] bArrCreateArg2 = createArg(this.TYPE_MAP, r6.size());
        final aq aqVar = new aq();
        aqVar.f48105a = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Map map = (Map) aqVar.f48105a;
            Object key = entry.getKey();
            x.c(key);
            byte[] bArrEncode = encode(key);
            Object value = entry.getValue();
            x.c(value);
            map.put(bArrEncode, encode(value));
        }
        ArrayList arrayList = new ArrayList(((Map) aqVar.f48105a).keySet());
        i.al(arrayList, new Comparator() { // from class: androidx.credentials.webauthn.Cbor$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return Cbor.encode$lambda$0(aqVar, (byte[]) obj3, (byte[]) obj4);
            }
        });
        Iterator it = arrayList.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            x.e(next, "next(...)");
            byte[] bArr = (byte[]) next;
            byte[] bArrM = c.m(bArrCreateArg2, bArr);
            Object obj3 = ((Map) aqVar.f48105a).get(bArr);
            x.c(obj3);
            bArrCreateArg2 = c.m(bArrM, (byte[]) obj3);
        }
        return bArrCreateArg2;
    }

    public final int getTYPE_ARRAY() {
        return this.TYPE_ARRAY;
    }

    public final int getTYPE_BYTE_STRING() {
        return this.TYPE_BYTE_STRING;
    }

    public final int getTYPE_FLOAT() {
        return this.TYPE_FLOAT;
    }

    public final int getTYPE_MAP() {
        return this.TYPE_MAP;
    }

    public final int getTYPE_NEGATIVE_INT() {
        return this.TYPE_NEGATIVE_INT;
    }

    public final int getTYPE_TAG() {
        return this.TYPE_TAG;
    }

    public final int getTYPE_TEXT_STRING() {
        return this.TYPE_TEXT_STRING;
    }

    public final int getTYPE_UNSIGNED_INT() {
        return this.TYPE_UNSIGNED_INT;
    }
}
