.class public abstract LW/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LS3/e;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, LW/g;->i:LW/g;

    .line 2
    .line 3
    sget-object v1, LW/h;->i:LW/h;

    .line 4
    .line 5
    new-instance v2, LS3/e;

    .line 6
    .line 7
    const/16 v3, 0x16

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v2, v0, v4, v1, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    sput-object v2, LW/i;->a:LS3/e;

    .line 14
    .line 15
    return-void
.end method
