package defpackage;

import android.content.Context;
import j$.io.FileRetargetClass;
import j$.nio.file.FileVisitOption;
import j$.nio.file.Files;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

@zje(a = zjc.a)
/* loaded from: classes2.dex */
public final class jrt {
    private final List a;

    public jrt(Context context) {
        Object objCollect = Files.walk(FileRetargetClass.toPath(context.getFilesDir()), new FileVisitOption[0]).map(new gjm(new hku(context, 10), 9)).collect(Collectors.toList());
        objCollect.getClass();
        this.a = woy.bU((Iterable) objCollect);
    }

    public final String toString() {
        Object objCollect = Collection.EL.stream(this.a).map(new gjm(jrs.a, 8)).collect(Collectors.joining("\n"));
        objCollect.getClass();
        return (String) objCollect;
    }
}
