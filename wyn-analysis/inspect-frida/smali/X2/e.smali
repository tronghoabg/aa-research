.class public final LX2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LA0/f;


# instance fields
.field public final a:LX2/f;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA0/f;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, LA0/f;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LX2/e;->c:LA0/f;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LX2/f;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX2/e;->a:LX2/f;

    .line 5
    .line 6
    iput p2, p0, LX2/e;->b:I

    .line 7
    .line 8
    return-void
.end method
