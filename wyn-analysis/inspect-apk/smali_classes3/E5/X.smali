.class public final LE5/X;
.super LE5/W;
.source "SourceFile"


# static fields
.field public static final g:LE5/X;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LE5/V;

    .line 2
    .line 3
    invoke-direct {v0}, LE5/V;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE5/X;

    .line 7
    .line 8
    invoke-direct {v1, v0}, LE5/W;-><init>(LE5/V;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, LE5/X;->g:LE5/X;

    .line 12
    .line 13
    return-void
.end method
