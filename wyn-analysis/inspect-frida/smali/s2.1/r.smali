.class public abstract Ls2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls2/w;


# instance fields
.field public final a:Ls2/w;


# direct methods
.method public constructor <init>(Ls2/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls2/r;->a:Ls2/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(J)Ls2/v;
    .locals 1

    .line 1
    iget-object v0, p0, Ls2/r;->a:Ls2/w;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ls2/w;->c(J)Ls2/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ls2/r;->a:Ls2/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ls2/w;->e()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Ls2/r;->a:Ls2/w;

    .line 2
    .line 3
    invoke-interface {v0}, Ls2/w;->f()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
