package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class koa {
    public static final koa a;
    public static final koa b;
    public static final koa c;
    public static final koa d;
    public static final koa e;
    public static final koa f;
    public static final koa g;
    public static final koa h;
    public static final koa i;
    public static final koa j;
    private static final /* synthetic */ koa[] k;

    static {
        koa koaVar = new koa("PING_TIMEOUT", 0);
        a = koaVar;
        koa koaVar2 = new koa("CONNECTION_ATTEMPT_START", 1);
        b = koaVar2;
        koa koaVar3 = new koa("WIFI_INFO_RESPONSE_RECEIVED", 2);
        c = koaVar3;
        koa koaVar4 = new koa("WIFI_START_REQUEST_RECEIVED", 3);
        d = koaVar4;
        koa koaVar5 = new koa("WIFI_START_RESPONSE_RECEIVED", 4);
        e = koaVar5;
        koa koaVar6 = new koa("WIFI_VERSION_REQUEST_RECEIVED", 5);
        f = koaVar6;
        koa koaVar7 = new koa("WIFI_INFO_REQUEST_SENT", 6);
        g = koaVar7;
        koa koaVar8 = new koa("WIFI_START_REQUEST_SENT", 7);
        h = koaVar8;
        koa koaVar9 = new koa("WIFI_START_RESPONSE_SENT", 8);
        i = koaVar9;
        koa koaVar10 = new koa("WIFI_CONNECT_STATUS_SENT", 9);
        j = koaVar10;
        k = new koa[]{koaVar, koaVar2, koaVar3, koaVar4, koaVar5, koaVar6, koaVar7, koaVar8, koaVar9, koaVar10};
    }

    public static koa valueOf(String str) {
        return (koa) Enum.valueOf(koa.class, str);
    }

    public static koa[] values() {
        return (koa[]) k.clone();
    }
}
