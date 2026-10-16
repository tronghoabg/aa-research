package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import Af.b;
import Af.t;
import N0.a;
import ff.AbstractC2641B;
import ff.o;
import ff.p;
import ff.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public class JvmNameResolverBase implements NameResolver {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final List<String> PREDEFINED_STRINGS;

    @NotNull
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f39770kotlin;

    @NotNull
    private final Set<Integer> localNameIndices;

    @NotNull
    private final List<JvmProtoBuf.StringTableTypes.Record> records;

    @NotNull
    private final String[] strings;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strW0 = o.w0(AbstractC3935e.D('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        f39770kotlin = strW0;
        List<String> listD = AbstractC3935e.D(a.f(strW0, "/Any"), a.f(strW0, "/Nothing"), a.f(strW0, "/Unit"), a.f(strW0, "/Throwable"), a.f(strW0, "/Number"), a.f(strW0, "/Byte"), a.f(strW0, "/Double"), a.f(strW0, "/Float"), a.f(strW0, "/Int"), a.f(strW0, "/Long"), a.f(strW0, "/Short"), a.f(strW0, "/Boolean"), a.f(strW0, "/Char"), a.f(strW0, "/CharSequence"), a.f(strW0, "/String"), a.f(strW0, "/Comparable"), a.f(strW0, "/Enum"), a.f(strW0, "/Array"), a.f(strW0, "/ByteArray"), a.f(strW0, "/DoubleArray"), a.f(strW0, "/FloatArray"), a.f(strW0, "/IntArray"), a.f(strW0, "/LongArray"), a.f(strW0, "/ShortArray"), a.f(strW0, "/BooleanArray"), a.f(strW0, "/CharArray"), a.f(strW0, "/Cloneable"), a.f(strW0, "/Annotation"), a.f(strW0, "/collections/Iterable"), a.f(strW0, "/collections/MutableIterable"), a.f(strW0, "/collections/Collection"), a.f(strW0, "/collections/MutableCollection"), a.f(strW0, "/collections/List"), a.f(strW0, "/collections/MutableList"), a.f(strW0, "/collections/Set"), a.f(strW0, "/collections/MutableSet"), a.f(strW0, "/collections/Map"), a.f(strW0, "/collections/MutableMap"), a.f(strW0, "/collections/Map.Entry"), a.f(strW0, "/collections/MutableMap.MutableEntry"), a.f(strW0, "/collections/Iterator"), a.f(strW0, "/collections/MutableIterator"), a.f(strW0, "/collections/ListIterator"), a.f(strW0, "/collections/MutableListIterator"));
        PREDEFINED_STRINGS = listD;
        t tVarY0 = o.Y0(listD);
        int iD = AbstractC2641B.D(p.a0(tVarY0, 10));
        if (iD < 16) {
            iD = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD);
        Iterator it = tVarY0.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.f1290c.hasNext()) {
                PREDEFINED_STRINGS_MAP = linkedHashMap;
                return;
            } else {
                y yVar = (y) bVar.next();
                linkedHashMap.put((String) yVar.f35436b, Integer.valueOf(yVar.f35435a));
            }
        }
    }

    public JvmNameResolverBase(@NotNull String[] strings, @NotNull Set<Integer> localNameIndices, @NotNull List<JvmProtoBuf.StringTableTypes.Record> records) {
        AbstractC3340k.e(strings, "strings");
        AbstractC3340k.e(localNameIndices, "localNameIndices");
        AbstractC3340k.e(records, "records");
        this.strings = strings;
        this.localNameIndices = localNameIndices;
        this.records = records;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i5) {
        return getString(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r10) {
        /*
            r9 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record> r0 = r9.records
            java.lang.Object r0 = r0.get(r10)
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r0 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r0
            boolean r1 = r0.hasString()
            if (r1 == 0) goto L13
            java.lang.String r10 = r0.getString()
            goto L36
        L13:
            boolean r1 = r0.hasPredefinedIndex()
            if (r1 == 0) goto L32
            java.util.List<java.lang.String> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.PREDEFINED_STRINGS
            int r2 = r1.size()
            int r3 = r0.getPredefinedIndex()
            if (r3 < 0) goto L32
            if (r3 >= r2) goto L32
            int r10 = r0.getPredefinedIndex()
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            goto L36
        L32:
            java.lang.String[] r1 = r9.strings
            r10 = r1[r10]
        L36:
            int r1 = r0.getSubstringIndexCount()
            java.lang.String r2 = "substring(...)"
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 < r5) goto L83
            java.util.List r1 = r0.getSubstringIndexList()
            kotlin.jvm.internal.AbstractC3340k.b(r1)
            java.lang.Object r6 = r1.get(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            int r7 = r6.intValue()
            if (r7 < 0) goto L83
            int r7 = r6.intValue()
            kotlin.jvm.internal.AbstractC3340k.b(r1)
            int r8 = r1.intValue()
            if (r7 > r8) goto L83
            int r7 = r1.intValue()
            int r8 = r10.length()
            if (r7 > r8) goto L83
            int r6 = r6.intValue()
            int r1 = r1.intValue()
            java.lang.String r10 = r10.substring(r6, r1)
            kotlin.jvm.internal.AbstractC3340k.d(r10, r2)
        L83:
            int r1 = r0.getReplaceCharCount()
            if (r1 < r5) goto Lad
            java.util.List r1 = r0.getReplaceCharList()
            kotlin.jvm.internal.AbstractC3340k.b(r1)
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            kotlin.jvm.internal.AbstractC3340k.b(r10)
            int r3 = r3.intValue()
            char r3 = (char) r3
            int r1 = r1.intValue()
            char r1 = (char) r1
            java.lang.String r10 = Bf.r.i0(r10, r3, r1)
        Lad:
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation r0 = r0.getOperation()
            if (r0 != 0) goto Lb5
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation r0 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Operation.NONE
        Lb5:
            int[] r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 46
            r3 = 36
            if (r0 == r5) goto Lde
            r6 = 3
            if (r0 == r6) goto Lc7
            goto Le5
        Lc7:
            int r0 = r10.length()
            if (r0 < r5) goto Ld9
            int r0 = r10.length()
            int r0 = r0 - r4
            java.lang.String r10 = r10.substring(r4, r0)
            kotlin.jvm.internal.AbstractC3340k.d(r10, r2)
        Ld9:
            java.lang.String r10 = Bf.r.i0(r10, r3, r1)
            goto Le5
        Lde:
            kotlin.jvm.internal.AbstractC3340k.b(r10)
            java.lang.String r10 = Bf.r.i0(r10, r3, r1)
        Le5:
            kotlin.jvm.internal.AbstractC3340k.b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolverBase.getString(int):java.lang.String");
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i5) {
        return this.localNameIndices.contains(Integer.valueOf(i5));
    }
}
