.class public final LCd/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJd/r;


# instance fields
.field public final a:LJd/n;

.field public final b:LJd/B;

.field public final c:LNd/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LJd/n;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, v1}, LA7/B0;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LCd/h;->a:LJd/n;

    .line 12
    .line 13
    new-instance v0, LJd/B;

    .line 14
    .line 15
    invoke-direct {v0}, LJd/B;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LCd/h;->b:LJd/B;

    .line 19
    .line 20
    new-instance v0, LNd/d;

    .line 21
    .line 22
    invoke-direct {v0}, LNd/d;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LCd/h;->c:LNd/d;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a()LJd/n;
    .locals 1

    .line 1
    iget-object v0, p0, LCd/h;->a:LJd/n;

    .line 2
    .line 3
    return-object v0
.end method
