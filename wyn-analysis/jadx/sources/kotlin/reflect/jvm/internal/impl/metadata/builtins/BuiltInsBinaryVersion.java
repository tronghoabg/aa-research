package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import ff.o;
import ff.p;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import org.jetbrains.annotations.NotNull;
import zf.f;
import zf.g;

/* loaded from: classes5.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final BuiltInsBinaryVersion INSTANCE = new BuiltInsBinaryVersion(1, 0, 7);

    @NotNull
    public static final BuiltInsBinaryVersion INVALID_VERSION = new BuiltInsBinaryVersion(new int[0]);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BuiltInsBinaryVersion readFrom(@NotNull InputStream stream) {
            AbstractC3340k.e(stream, "stream");
            DataInputStream dataInputStream = new DataInputStream(stream);
            g gVar = new g(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(p.a0(gVar, 10));
            Iterator it = gVar.iterator();
            while (((f) it).f48505c) {
                ((f) it).a();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrR0 = o.R0(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(iArrR0, iArrR0.length));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(@NotNull int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        AbstractC3340k.e(numbers, "numbers");
    }

    public boolean isCompatibleWithCurrentCompilerVersion() {
        return isCompatibleTo(INSTANCE);
    }
}
