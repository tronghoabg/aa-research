.class public final synthetic Lk2/K;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ1/c;


# instance fields
.field public final synthetic a:LZ1/d;

.field public final synthetic b:Lk2/z;

.field public final synthetic c:Lh2/g;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(LZ1/d;Lk2/z;Lh2/g;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/K;->a:LZ1/d;

    iput-object p2, p0, Lk2/K;->b:Lk2/z;

    iput-object p3, p0, Lk2/K;->c:Lh2/g;

    iput-object p4, p0, Lk2/K;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lk2/K;->e:Z

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lk2/M;

    .line 3
    .line 4
    iget-object p1, p0, Lk2/K;->a:LZ1/d;

    .line 5
    .line 6
    iget v1, p1, LZ1/d;->a:I

    .line 7
    .line 8
    iget-object v3, p0, Lk2/K;->b:Lk2/z;

    .line 9
    .line 10
    iget-object v4, p0, Lk2/K;->c:Lh2/g;

    .line 11
    .line 12
    iget-object v5, p0, Lk2/K;->d:Ljava/io/IOException;

    .line 13
    .line 14
    iget-boolean v6, p0, Lk2/K;->e:Z

    .line 15
    .line 16
    iget-object v2, p1, LZ1/d;->b:Lk2/H;

    .line 17
    .line 18
    invoke-interface/range {v0 .. v6}, Lk2/M;->s(ILk2/H;Lk2/z;Lh2/g;Ljava/io/IOException;Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method
