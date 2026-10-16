package defpackage;

import com.android.car.libraries.apphost.external.model.LocalWrapperTemplate;

/* loaded from: classes2.dex */
public final /* synthetic */ class mec extends afey implements afec {
    public static final mec a = new mec();

    public mec() {
        super(1, LocalWrapperTemplate.class, "<init>", "<init>(Landroidx/car/app/model/Template;)V", 0);
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        wb wbVar = (wb) obj;
        wbVar.getClass();
        return new LocalWrapperTemplate(wbVar);
    }
}
