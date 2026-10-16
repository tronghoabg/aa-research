.class public final Lk2/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/G;


# instance fields
.field public final a:LS3/c;

.field public final b:Lcom/unity3d/services/core/webview/b;

.field public final c:LMf/d;

.field public final d:Lae/d;

.field public final e:I


# direct methods
.method public constructor <init>(LS3/c;Ls2/k;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/unity3d/services/core/webview/b;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    new-instance p2, LMf/d;

    .line 9
    .line 10
    invoke-direct {p2}, LMf/d;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lae/d;

    .line 14
    .line 15
    const/16 v2, 0xa

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lk2/Y;->a:LS3/c;

    .line 24
    .line 25
    iput-object v0, p0, Lk2/Y;->b:Lcom/unity3d/services/core/webview/b;

    .line 26
    .line 27
    iput-object p2, p0, Lk2/Y;->c:LMf/d;

    .line 28
    .line 29
    iput-object v1, p0, Lk2/Y;->d:Lae/d;

    .line 30
    .line 31
    const/high16 p1, 0x100000

    .line 32
    .line 33
    iput p1, p0, Lk2/Y;->e:I

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(Lwa/a;)Lk2/G;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final b(Z)Lk2/G;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final c(LN1/w;)Lk2/a;
    .locals 9

    .line 1
    iget-object v0, p1, LN1/w;->b:LN1/t;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lk2/Z;

    .line 7
    .line 8
    iget-object v0, p0, Lk2/Y;->c:LMf/d;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LMf/d;->b(LN1/w;)LZ1/g;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-object v6, p0, Lk2/Y;->d:Lae/d;

    .line 15
    .line 16
    iget-object v4, p0, Lk2/Y;->b:Lcom/unity3d/services/core/webview/b;

    .line 17
    .line 18
    iget v7, p0, Lk2/Y;->e:I

    .line 19
    .line 20
    iget-object v3, p0, Lk2/Y;->a:LS3/c;

    .line 21
    .line 22
    const/4 v8, 0x0

    .line 23
    move-object v2, p1

    .line 24
    invoke-direct/range {v1 .. v8}, Lk2/Z;-><init>(LN1/w;LS3/c;Lcom/unity3d/services/core/webview/b;LZ1/g;Lae/d;IZ)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method
