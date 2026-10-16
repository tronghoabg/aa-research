.class public final Lod/g1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lmd/e;

.field public b:Lmd/m;

.field public final c:Lod/d1;

.field public d:Z


# direct methods
.method public constructor <init>(Lmd/e;Lod/d1;)V
    .locals 2

    .line 1
    sget-object v0, Lmd/m;->d:Lmd/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-boolean v1, p0, Lod/g1;->d:Z

    .line 8
    .line 9
    iput-object p1, p0, Lod/g1;->a:Lmd/e;

    .line 10
    .line 11
    iput-object v0, p0, Lod/g1;->b:Lmd/m;

    .line 12
    .line 13
    iput-object p2, p0, Lod/g1;->c:Lod/d1;

    .line 14
    .line 15
    return-void
.end method

.method public static a(Lod/g1;Lmd/m;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lod/g1;->b:Lmd/m;

    .line 2
    .line 3
    sget-object v0, Lmd/m;->b:Lmd/m;

    .line 4
    .line 5
    if-eq p1, v0, :cond_2

    .line 6
    .line 7
    sget-object v0, Lmd/m;->c:Lmd/m;

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v0, Lmd/m;->d:Lmd/m;

    .line 13
    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput-boolean p1, p0, Lod/g1;->d:Z

    .line 18
    .line 19
    :cond_1
    return-void

    .line 20
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lod/g1;->d:Z

    .line 22
    .line 23
    return-void
.end method
