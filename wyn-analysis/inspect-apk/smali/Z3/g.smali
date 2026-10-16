.class public final LZ3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LZ3/g;


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LZ3/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, v1}, LZ3/g;-><init>(ZI)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LZ3/g;->c:LZ3/g;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, LZ3/g;->a:Z

    .line 5
    .line 6
    iput p2, p0, LZ3/g;->b:I

    .line 7
    .line 8
    return-void
.end method
