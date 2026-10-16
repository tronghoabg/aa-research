.class public abstract LCd/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvg/b;

.field public static final b:LDd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "io.ktor.client.plugins.UserAgent"

    .line 2
    .line 3
    invoke-static {v0}, Lvg/d;->c(Ljava/lang/String;)Lvg/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LCd/z0;->a:Lvg/b;

    .line 8
    .line 9
    sget-object v0, LCd/x0;->a:LCd/x0;

    .line 10
    .line 11
    new-instance v1, LAd/g;

    .line 12
    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    invoke-direct {v1, v2}, LAd/g;-><init>(I)V

    .line 16
    .line 17
    .line 18
    const-string v2, "UserAgent"

    .line 19
    .line 20
    invoke-static {v2, v0, v1}, LU8/v0;->s(Ljava/lang/String;Ltf/a;Ltf/l;)LDd/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, LCd/z0;->b:LDd/c;

    .line 25
    .line 26
    return-void
.end method
