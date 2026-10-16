.class public abstract LE/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LE/I;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, LE/i;->a:LE/f;

    .line 3
    .line 4
    int-to-float v1, v0

    .line 5
    sget-object v2, LZ/a;->l:LZ/b;

    .line 6
    .line 7
    new-instance v3, LE/u;

    .line 8
    .line 9
    invoke-direct {v3, v2, v0}, LE/u;-><init>(Ljava/lang/Object;I)V

    .line 10
    .line 11
    .line 12
    sget-object v0, LE/r;->j:LE/r;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {v1, v2, v3, v0}, Lgc/b;->F(FILandroid/support/v4/media/session/b;Ltf/s;)LE/I;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, LE/t;->a:LE/I;

    .line 20
    .line 21
    return-void
.end method
