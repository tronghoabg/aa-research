package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import ef.C2533q;
import ff.o;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class NameResolverImpl implements NameResolver {

    @NotNull
    private final ProtoBuf.QualifiedNameTable qualifiedNames;

    @NotNull
    private final ProtoBuf.StringTable strings;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(@NotNull ProtoBuf.StringTable strings, @NotNull ProtoBuf.QualifiedNameTable qualifiedNames) {
        AbstractC3340k.e(strings, "strings");
        AbstractC3340k.e(qualifiedNames, "qualifiedNames");
        this.strings = strings;
        this.qualifiedNames = qualifiedNames;
    }

    private final C2533q traverseIds(int i5) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z2 = false;
        while (i5 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.qualifiedNames.getQualifiedName(i5);
            String string = this.strings.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            AbstractC3340k.b(kind);
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 == 1) {
                linkedList2.addFirst(string);
            } else if (i10 == 2) {
                linkedList.addFirst(string);
            } else if (i10 == 3) {
                linkedList2.addFirst(string);
                z2 = true;
            }
            i5 = qualifiedName.getParentQualifiedName();
        }
        return new C2533q(linkedList, linkedList2, Boolean.valueOf(z2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i5) {
        C2533q c2533qTraverseIds = traverseIds(i5);
        List list = (List) c2533qTraverseIds.f34681a;
        String strW0 = o.w0((List) c2533qTraverseIds.f34682b, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strW0;
        }
        return o.w0(list, "/", null, null, null, 62) + '/' + strW0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i5) {
        String string = this.strings.getString(i5);
        AbstractC3340k.d(string, "getString(...)");
        return string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i5) {
        return ((Boolean) traverseIds(i5).f34683c).booleanValue();
    }
}
