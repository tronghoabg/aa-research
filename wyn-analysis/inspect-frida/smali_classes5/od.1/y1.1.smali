.class public final Lod/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod/A1;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lod/B0;


# direct methods
.method public constructor <init>(Lod/B0;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/y1;->b:Lod/B0;

    .line 5
    .line 6
    iput-object p2, p0, Lod/y1;->a:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lod/G1;)V
    .locals 3

    .line 1
    iget-object v0, p1, Lod/G1;->a:Lod/r;

    .line 2
    .line 3
    iget-object v1, p0, Lod/y1;->b:Lod/B0;

    .line 4
    .line 5
    iget-object v1, v1, Lod/B0;->a:LF6/r;

    .line 6
    .line 7
    iget-object v2, p0, Lod/y1;->a:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, LF6/r;->f(Ljava/lang/Object;)Ltd/a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lod/X1;->c(Ltd/a;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lod/G1;->a:Lod/r;

    .line 17
    .line 18
    invoke-interface {p1}, Lod/X1;->flush()V

    .line 19
    .line 20
    .line 21
    return-void
.end method
