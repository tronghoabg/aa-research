.class public abstract LT8/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lad/L;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lj9/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lj9/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LT8/a;->a:LT8/a;

    .line 7
    .line 8
    const-class v2, LT8/m;

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Lj9/d;->registerEncoder(Ljava/lang/Class;Lh9/e;)Li9/b;

    .line 11
    .line 12
    .line 13
    const-class v2, LT8/b;

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Lj9/d;->registerEncoder(Ljava/lang/Class;Lh9/e;)Li9/b;

    .line 16
    .line 17
    .line 18
    new-instance v1, Lad/L;

    .line 19
    .line 20
    const/16 v2, 0xb

    .line 21
    .line 22
    invoke-direct {v1, v0, v2}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    sput-object v1, LT8/m;->a:Lad/L;

    .line 26
    .line 27
    return-void
.end method
