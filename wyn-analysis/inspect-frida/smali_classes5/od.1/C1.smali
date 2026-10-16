.class public final Lod/C1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/A1;


# instance fields
.field public final synthetic a:Lod/B0;


# direct methods
.method public constructor <init>(Lod/B0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/C1;->a:Lod/B0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lod/G1;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lod/G1;->a:Lod/r;

    .line 2
    .line 3
    new-instance v1, Lod/a2;

    .line 4
    .line 5
    iget-object v2, p0, Lod/C1;->a:Lod/B0;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    invoke-direct {v1, v3, v2, p1}, Lod/a2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Lod/r;->k(Lod/t;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
