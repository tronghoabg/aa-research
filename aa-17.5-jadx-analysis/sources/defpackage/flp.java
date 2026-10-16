package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes2.dex */
final /* synthetic */ class flp extends afey implements afek {
    public static final flp a = new flp();

    public flp() {
        super(6, flq.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    @Override // defpackage.afek
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        fiy fiyVar = (fiy) obj2;
        ajdr ajdrVar = (ajdr) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        kzt kztVar = (kzt) obj5;
        fkm fkmVar = (fkm) obj6;
        context.getClass();
        fiyVar.getClass();
        ajdrVar.getClass();
        workDatabase.getClass();
        kztVar.getClass();
        fkmVar.getClass();
        afbt afbtVar = new afbt(10);
        String str = fkq.a;
        fmf fmfVar = new fmf(context, workDatabase);
        fot.a(context, SystemJobService.class, true);
        fjo.a().c(fkq.a, "Created SystemJobScheduler and enabled SystemJobService");
        afbtVar.add(fmfVar);
        afbtVar.add(new fmc(context, fiyVar, kztVar, fkmVar, new sx(fkmVar, ajdrVar), ajdrVar));
        return afbtVar.f();
    }
}
