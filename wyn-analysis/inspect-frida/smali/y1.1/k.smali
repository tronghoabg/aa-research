.class public final Ly1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Lad/I;


# instance fields
.field public final a:Ly1/f;

.field public b:I

.field public final c:Ly1/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lad/I;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lad/I;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ly1/k;->d:Lad/I;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ly1/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ly1/k;->b:I

    .line 6
    .line 7
    new-instance v0, Ly1/c;

    .line 8
    .line 9
    invoke-direct {v0}, Ly1/c;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ly1/k;->c:Ly1/c;

    .line 13
    .line 14
    iput-object p1, p0, Ly1/k;->a:Ly1/f;

    .line 15
    .line 16
    return-void
.end method
