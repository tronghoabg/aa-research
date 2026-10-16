package kotlin.reflect.jvm.internal.impl.load.java;

import gf.C2755b;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import tf.a;

/* loaded from: classes5.dex */
public final class Jsr305Settings$description$2 extends AbstractC3343n implements a {
    final /* synthetic */ Jsr305Settings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jsr305Settings$description$2(Jsr305Settings jsr305Settings) {
        super(0);
        this.this$0 = jsr305Settings;
    }

    @Override // tf.a
    @NotNull
    public final String[] invoke() {
        Jsr305Settings jsr305Settings = this.this$0;
        C2755b c2755bT = AbstractC3935e.t();
        c2755bT.add(jsr305Settings.getGlobalLevel().getDescription());
        ReportLevel migrationLevel = jsr305Settings.getMigrationLevel();
        if (migrationLevel != null) {
            c2755bT.add("under-migration:" + migrationLevel.getDescription());
        }
        for (Map.Entry<FqName, ReportLevel> entry : jsr305Settings.getUserDefinedLevelForSpecificAnnotation().entrySet()) {
            c2755bT.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (String[]) AbstractC3935e.l(c2755bT).toArray(new String[0]);
    }
}
