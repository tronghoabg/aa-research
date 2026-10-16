package defpackage;

/* loaded from: classes.dex */
public final class tfa implements aezk {
    private final ldq a;

    public tfa(ldq ldqVar) {
        this.a = ldqVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* bridge */ /* synthetic */ Object a() {
        abnr abnrVar = (abnr) ajey.a.n();
        abnh abnhVar = ajez.d;
        abnp abnpVarN = ajew.a.n();
        ldq ldqVar = this.a;
        boolean zE = ldqVar.e();
        abnpVarN.t();
        ajew ajewVar = (ajew) abnpVarN.b;
        ajewVar.b |= 64;
        ajewVar.h = zE;
        Boolean boolB = ldqVar.b();
        if (boolB != null) {
            boolean zBooleanValue = boolB.booleanValue();
            abnpVarN.t();
            ajew ajewVar2 = (ajew) abnpVarN.b;
            ajewVar2.b |= 128;
            ajewVar2.i = zBooleanValue;
        }
        tea teaVarA = ldqVar.a();
        if (teaVarA != null) {
            abnpVarN.t();
            ajew ajewVar3 = (ajew) abnpVarN.b;
            String str = teaVarA.a;
            str.getClass();
            ajewVar3.b |= 1;
            ajewVar3.c = str;
            abnpVarN.t();
            ajew ajewVar4 = (ajew) abnpVarN.b;
            String str2 = teaVarA.b;
            str2.getClass();
            ajewVar4.b |= 2;
            ajewVar4.d = str2;
            abnpVarN.t();
            ajew ajewVar5 = (ajew) abnpVarN.b;
            String str3 = teaVarA.c;
            str3.getClass();
            ajewVar5.b |= 4;
            ajewVar5.e = str3;
            abnpVarN.t();
            ajew ajewVar6 = (ajew) abnpVarN.b;
            String str4 = teaVarA.d;
            str4.getClass();
            ajewVar6.b |= 8;
            ajewVar6.f = str4;
            abnpVarN.t();
            ajew ajewVar7 = (ajew) abnpVarN.b;
            String str5 = teaVarA.e;
            str5.getClass();
            ajewVar7.b |= 16;
            ajewVar7.g = str5;
        }
        yyi yyiVarG = ldq.g();
        if (yyiVarG != null && !yyi.UNKNOWN.equals(yyiVarG)) {
            int i = yyiVarG.f;
            abnpVarN.t();
            ajew ajewVar8 = (ajew) abnpVarN.b;
            ajewVar8.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
            ajewVar8.j = i;
        }
        abnp abnpVarN2 = ajez.a.n();
        ajew ajewVar9 = (ajew) abnpVarN.q();
        abnpVarN2.t();
        ajez ajezVar = (ajez) abnpVarN2.b;
        ajewVar9.getClass();
        ajezVar.c = ajewVar9;
        ajezVar.b |= 1;
        abnrVar.bc(abnhVar, (ajez) abnpVarN2.q());
        return (ajey) abnrVar.q();
    }
}
