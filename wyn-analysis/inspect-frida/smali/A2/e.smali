.class public final LA2/e;
.super Ls2/r;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ls2/w;

.field public final synthetic c:LA2/d;


# direct methods
.method public constructor <init>(LA2/d;Ls2/w;Ls2/w;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA2/e;->c:LA2/d;

    .line 2
    .line 3
    iput-object p3, p0, LA2/e;->b:Ls2/w;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ls2/r;-><init>(Ls2/w;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(J)Ls2/v;
    .locals 8

    .line 1
    iget-object v0, p0, LA2/e;->b:Ls2/w;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ls2/w;->c(J)Ls2/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance p2, Ls2/v;

    .line 8
    .line 9
    new-instance v0, Ls2/x;

    .line 10
    .line 11
    iget-object v1, p1, Ls2/v;->a:Ls2/x;

    .line 12
    .line 13
    iget-wide v2, v1, Ls2/x;->a:J

    .line 14
    .line 15
    iget-object v4, p0, LA2/e;->c:LA2/d;

    .line 16
    .line 17
    iget-wide v4, v4, LA2/d;->b:J

    .line 18
    .line 19
    iget-wide v6, v1, Ls2/x;->b:J

    .line 20
    .line 21
    add-long/2addr v6, v4

    .line 22
    invoke-direct {v0, v2, v3, v6, v7}, Ls2/x;-><init>(JJ)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ls2/x;

    .line 26
    .line 27
    iget-object p1, p1, Ls2/v;->b:Ls2/x;

    .line 28
    .line 29
    iget-wide v2, p1, Ls2/x;->a:J

    .line 30
    .line 31
    iget-wide v6, p1, Ls2/x;->b:J

    .line 32
    .line 33
    add-long/2addr v6, v4

    .line 34
    invoke-direct {v1, v2, v3, v6, v7}, Ls2/x;-><init>(JJ)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p2, v0, v1}, Ls2/v;-><init>(Ls2/x;Ls2/x;)V

    .line 38
    .line 39
    .line 40
    return-object p2
.end method
