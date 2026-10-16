.class public final LW1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LN1/n;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:LO1/a;

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(LN1/n;IIIIIIILO1/a;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW1/n;->a:LN1/n;

    .line 5
    .line 6
    iput p2, p0, LW1/n;->b:I

    .line 7
    .line 8
    iput p3, p0, LW1/n;->c:I

    .line 9
    .line 10
    iput p4, p0, LW1/n;->d:I

    .line 11
    .line 12
    iput p5, p0, LW1/n;->e:I

    .line 13
    .line 14
    iput p6, p0, LW1/n;->f:I

    .line 15
    .line 16
    iput p7, p0, LW1/n;->g:I

    .line 17
    .line 18
    iput p8, p0, LW1/n;->h:I

    .line 19
    .line 20
    iput-object p9, p0, LW1/n;->i:LO1/a;

    .line 21
    .line 22
    iput-boolean p10, p0, LW1/n;->j:Z

    .line 23
    .line 24
    iput-boolean p11, p0, LW1/n;->k:Z

    .line 25
    .line 26
    iput-boolean p12, p0, LW1/n;->l:Z

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()LW1/g;
    .locals 7

    .line 1
    new-instance v0, LW1/g;

    .line 2
    .line 3
    iget v1, p0, LW1/n;->c:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v2, 0x0

    .line 10
    :goto_0
    iget v1, p0, LW1/n;->f:I

    .line 11
    .line 12
    iget-boolean v3, p0, LW1/n;->l:Z

    .line 13
    .line 14
    iget v4, p0, LW1/n;->g:I

    .line 15
    .line 16
    iget v5, p0, LW1/n;->e:I

    .line 17
    .line 18
    iget v6, p0, LW1/n;->h:I

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput v4, v0, LW1/g;->b:I

    .line 24
    .line 25
    iput v5, v0, LW1/g;->c:I

    .line 26
    .line 27
    iput v1, v0, LW1/g;->e:I

    .line 28
    .line 29
    iput-boolean v3, v0, LW1/g;->a:Z

    .line 30
    .line 31
    iput-boolean v2, v0, LW1/g;->d:Z

    .line 32
    .line 33
    iput v6, v0, LW1/g;->f:I

    .line 34
    .line 35
    return-object v0
.end method
