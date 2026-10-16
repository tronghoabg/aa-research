.class public abstract LG0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LG0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Lm9/S;

    .line 8
    .line 9
    const/16 v1, 0x12

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lm9/S;-><init>(I)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, Lc8/e;

    .line 16
    .line 17
    const/16 v1, 0x12

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lc8/e;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sput-object v0, LG0/e;->a:LG0/d;

    .line 23
    .line 24
    return-void
.end method
