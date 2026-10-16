.class public abstract LZ4/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lc8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc8/e;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lc8/e;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LZ4/d;->a:Lc8/e;

    .line 9
    .line 10
    return-void
.end method

.method public static a(ILZ4/a;)LDd/c;
    .locals 3

    .line 1
    new-instance v0, Lj1/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lj1/c;-><init>(I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, LZ4/d;->a:Lc8/e;

    .line 7
    .line 8
    new-instance v1, LDd/c;

    .line 9
    .line 10
    const/16 v2, 0x11

    .line 11
    .line 12
    invoke-direct {v1, v0, p1, p0, v2}, LDd/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method
