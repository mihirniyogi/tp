package powerbake.address.testutil;

import powerbake.address.commons.core.index.Index;

/**
 * A utility class containing a list of {@code Index} objects to be used in tests.
 */
public class TypicalIndexes {
    public static final Index INDEX_FIRST_PERSON = Index.fromOneBased(1);
    public static final Index INDEX_SECOND_PERSON = Index.fromOneBased(2);
    public static final Index INDEX_THIRD_PERSON = Index.fromOneBased(3);
    public static final Index INDEX_FIRST_PASTRY = Index.fromZeroBased(0);
    public static final Index INDEX_SECOND_PASTRY = Index.fromZeroBased(1);

}
