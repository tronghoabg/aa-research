.class public abstract LCd/T;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvg/b;

.field public static final b:LDd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "io.ktor.client.plugins.HttpRequestLifecycle"

    .line 2
    .line 3
    invoke-static {v0}, Lvg/d;->c(Ljava/lang/String;)Lvg/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LCd/T;->a:Lvg/b;

    .line 8
    .line 9
    new-instance v0, LAd/g;

    .line 10
    .line 11
    const/16 v1, 0xc

    .line 12
    .line 13
    invoke-direct {v0, v1}, LAd/g;-><init>(I)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/moloco/sdk/service_locator/h;

    .line 17
    .line 18
    const/16 v2, 0xe

    .line 19
    .line 20
    invoke-direct {v1, v2}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const-string v2, "RequestLifecycle"

    .line 24
    .line 25
    invoke-static {v2, v1, v0}, LU8/v0;->s(Ljava/lang/String;Ltf/a;Ltf/l;)LDd/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, LCd/T;->b:LDd/c;

    .line 30
    .line 31
    return-void
.end method
