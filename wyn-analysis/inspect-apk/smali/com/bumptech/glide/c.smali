.class public final Lcom/bumptech/glide/c;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final i:Lcom/bumptech/glide/a;


# instance fields
.field public final a:LF4/f;

.field public final b:Lcom/bumptech/glide/f;

.field public final c:Lad/I;

.field public final d:Ljava/util/List;

.field public final e:Lx/e;

.field public final f:LE4/o;

.field public final g:I

.field public h:LU4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bumptech/glide/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LW4/b;->a:LW4/a;

    .line 7
    .line 8
    iput-object v1, v0, Lcom/bumptech/glide/a;->a:LW4/a;

    .line 9
    .line 10
    sput-object v0, Lcom/bumptech/glide/c;->i:Lcom/bumptech/glide/a;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LF4/f;Lcom/bumptech/glide/f;Lad/I;Lx/e;Ljava/util/List;LE4/o;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lcom/bumptech/glide/c;->a:LF4/f;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/f;

    .line 11
    .line 12
    iput-object p4, p0, Lcom/bumptech/glide/c;->c:Lad/I;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/bumptech/glide/c;->d:Ljava/util/List;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/bumptech/glide/c;->e:Lx/e;

    .line 17
    .line 18
    iput-object p7, p0, Lcom/bumptech/glide/c;->f:LE4/o;

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    iput p1, p0, Lcom/bumptech/glide/c;->g:I

    .line 22
    .line 23
    return-void
.end method
